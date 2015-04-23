
  package gen;
  public class J_Gen193 {
  		@com.google.inject.Inject
  		public J_Gen193(J_Gen194 j_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  