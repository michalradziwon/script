
  package gen;
  public class J_Gen52 {
  		@com.google.inject.Inject
  		public J_Gen52(J_Gen53 j_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  