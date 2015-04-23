
  package gen;
  public class H_Gen113 {
  		@com.google.inject.Inject
  		public H_Gen113(H_Gen114 h_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  