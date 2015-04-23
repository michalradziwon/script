
  package gen;
  public class D_Gen160 {
  		@com.google.inject.Inject
  		public D_Gen160(D_Gen161 d_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  