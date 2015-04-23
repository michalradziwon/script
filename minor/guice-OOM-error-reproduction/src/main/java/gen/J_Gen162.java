
  package gen;
  public class J_Gen162 {
  		@com.google.inject.Inject
  		public J_Gen162(J_Gen163 j_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  