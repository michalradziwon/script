
  package gen;
  public class H_Gen61 {
  		@com.google.inject.Inject
  		public H_Gen61(H_Gen62 h_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  