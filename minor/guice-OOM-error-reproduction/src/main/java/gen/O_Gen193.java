
  package gen;
  public class O_Gen193 {
  		@com.google.inject.Inject
  		public O_Gen193(O_Gen194 o_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  