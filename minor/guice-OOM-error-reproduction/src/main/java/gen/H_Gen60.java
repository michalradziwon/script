
  package gen;
  public class H_Gen60 {
  		@com.google.inject.Inject
  		public H_Gen60(H_Gen61 h_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  