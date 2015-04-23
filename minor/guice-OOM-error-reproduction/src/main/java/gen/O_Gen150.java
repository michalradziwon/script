
  package gen;
  public class O_Gen150 {
  		@com.google.inject.Inject
  		public O_Gen150(O_Gen151 o_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  