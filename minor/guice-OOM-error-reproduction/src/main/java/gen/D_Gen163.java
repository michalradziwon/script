
  package gen;
  public class D_Gen163 {
  		@com.google.inject.Inject
  		public D_Gen163(D_Gen164 d_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  