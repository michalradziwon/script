
  package gen;
  public class D_Gen135 {
  		@com.google.inject.Inject
  		public D_Gen135(D_Gen136 d_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  