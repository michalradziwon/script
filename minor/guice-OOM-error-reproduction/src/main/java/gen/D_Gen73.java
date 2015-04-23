
  package gen;
  public class D_Gen73 {
  		@com.google.inject.Inject
  		public D_Gen73(D_Gen74 d_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  