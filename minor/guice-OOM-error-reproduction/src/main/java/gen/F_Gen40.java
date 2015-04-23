
  package gen;
  public class F_Gen40 {
  		@com.google.inject.Inject
  		public F_Gen40(F_Gen41 f_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  