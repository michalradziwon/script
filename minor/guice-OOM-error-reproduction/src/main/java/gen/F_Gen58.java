
  package gen;
  public class F_Gen58 {
  		@com.google.inject.Inject
  		public F_Gen58(F_Gen59 f_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  