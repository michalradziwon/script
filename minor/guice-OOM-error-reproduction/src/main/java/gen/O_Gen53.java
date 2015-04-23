
  package gen;
  public class O_Gen53 {
  		@com.google.inject.Inject
  		public O_Gen53(O_Gen54 o_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  