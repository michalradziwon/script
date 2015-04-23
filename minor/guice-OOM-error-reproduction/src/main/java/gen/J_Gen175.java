
  package gen;
  public class J_Gen175 {
  		@com.google.inject.Inject
  		public J_Gen175(J_Gen176 j_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  