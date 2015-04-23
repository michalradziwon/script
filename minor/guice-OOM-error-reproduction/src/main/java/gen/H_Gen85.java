
  package gen;
  public class H_Gen85 {
  		@com.google.inject.Inject
  		public H_Gen85(H_Gen86 h_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  