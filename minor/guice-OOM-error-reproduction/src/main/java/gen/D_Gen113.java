
  package gen;
  public class D_Gen113 {
  		@com.google.inject.Inject
  		public D_Gen113(D_Gen114 d_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  