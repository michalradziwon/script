
  package gen;
  public class H_Gen7 {
  		@com.google.inject.Inject
  		public H_Gen7(H_Gen8 h_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  