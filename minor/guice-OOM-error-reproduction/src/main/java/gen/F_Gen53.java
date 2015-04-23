
  package gen;
  public class F_Gen53 {
  		@com.google.inject.Inject
  		public F_Gen53(F_Gen54 f_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  