
  package gen;
  public class D_Gen26 {
  		@com.google.inject.Inject
  		public D_Gen26(D_Gen27 d_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  