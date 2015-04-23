
  package gen;
  public class J_Gen150 {
  		@com.google.inject.Inject
  		public J_Gen150(J_Gen151 j_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  