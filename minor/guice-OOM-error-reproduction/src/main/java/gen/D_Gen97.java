
  package gen;
  public class D_Gen97 {
  		@com.google.inject.Inject
  		public D_Gen97(D_Gen98 d_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  