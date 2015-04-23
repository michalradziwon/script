
  package gen;
  public class F_Gen17 {
  		@com.google.inject.Inject
  		public F_Gen17(F_Gen18 f_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  