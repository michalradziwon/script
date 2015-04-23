
  package gen;
  public class H_Gen170 {
  		@com.google.inject.Inject
  		public H_Gen170(H_Gen171 h_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  