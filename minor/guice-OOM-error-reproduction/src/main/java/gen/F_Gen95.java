
  package gen;
  public class F_Gen95 {
  		@com.google.inject.Inject
  		public F_Gen95(F_Gen96 f_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  