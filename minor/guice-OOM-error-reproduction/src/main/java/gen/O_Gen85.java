
  package gen;
  public class O_Gen85 {
  		@com.google.inject.Inject
  		public O_Gen85(O_Gen86 o_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  