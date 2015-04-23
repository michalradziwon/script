
  package gen;
  public class J_Gen164 {
  		@com.google.inject.Inject
  		public J_Gen164(J_Gen165 j_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  