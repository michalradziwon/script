
  package gen;
  public class O_Gen60 {
  		@com.google.inject.Inject
  		public O_Gen60(O_Gen61 o_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  