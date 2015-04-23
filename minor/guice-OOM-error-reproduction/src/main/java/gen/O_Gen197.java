
  package gen;
  public class O_Gen197 {
  		@com.google.inject.Inject
  		public O_Gen197(O_Gen198 o_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  