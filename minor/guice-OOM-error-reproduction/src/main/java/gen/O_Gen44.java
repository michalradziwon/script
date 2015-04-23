
  package gen;
  public class O_Gen44 {
  		@com.google.inject.Inject
  		public O_Gen44(O_Gen45 o_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  