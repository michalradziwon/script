
  package gen;
  public class F_Gen80 {
  		@com.google.inject.Inject
  		public F_Gen80(F_Gen81 f_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  