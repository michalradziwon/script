
  package gen;
  public class J_Gen53 {
  		@com.google.inject.Inject
  		public J_Gen53(J_Gen54 j_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  