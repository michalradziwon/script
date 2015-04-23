
  package gen;
  public class U_Gen107 {
  		@com.google.inject.Inject
  		public U_Gen107(U_Gen108 u_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  