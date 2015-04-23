
  package gen;
  public class U_Gen158 {
  		@com.google.inject.Inject
  		public U_Gen158(U_Gen159 u_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  