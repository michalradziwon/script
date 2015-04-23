
  package gen;
  public class J_Gen95 {
  		@com.google.inject.Inject
  		public J_Gen95(J_Gen96 j_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  