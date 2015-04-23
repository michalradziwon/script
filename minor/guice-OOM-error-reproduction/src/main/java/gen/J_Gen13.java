
  package gen;
  public class J_Gen13 {
  		@com.google.inject.Inject
  		public J_Gen13(J_Gen14 j_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  