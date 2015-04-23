
  package gen;
  public class J_Gen163 {
  		@com.google.inject.Inject
  		public J_Gen163(J_Gen164 j_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  