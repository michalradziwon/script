
  package gen;
  public class J_Gen15 {
  		@com.google.inject.Inject
  		public J_Gen15(J_Gen16 j_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  