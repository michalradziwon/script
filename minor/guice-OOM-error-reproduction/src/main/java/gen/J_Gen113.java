
  package gen;
  public class J_Gen113 {
  		@com.google.inject.Inject
  		public J_Gen113(J_Gen114 j_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  