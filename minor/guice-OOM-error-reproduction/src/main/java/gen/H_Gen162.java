
  package gen;
  public class H_Gen162 {
  		@com.google.inject.Inject
  		public H_Gen162(H_Gen163 h_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  