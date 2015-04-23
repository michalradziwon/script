
  package gen;
  public class U_Gen167 {
  		@com.google.inject.Inject
  		public U_Gen167(U_Gen168 u_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  