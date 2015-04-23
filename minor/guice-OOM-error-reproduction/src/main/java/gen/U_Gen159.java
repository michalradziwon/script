
  package gen;
  public class U_Gen159 {
  		@com.google.inject.Inject
  		public U_Gen159(U_Gen160 u_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  