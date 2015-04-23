
  package gen;
  public class J_Gen58 {
  		@com.google.inject.Inject
  		public J_Gen58(J_Gen59 j_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  