
  package gen;
  public class D_Gen114 {
  		@com.google.inject.Inject
  		public D_Gen114(D_Gen115 d_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  