
  package gen;
  public class D_Gen105 {
  		@com.google.inject.Inject
  		public D_Gen105(D_Gen106 d_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  