
  package gen;
  public class F_Gen151 {
  		@com.google.inject.Inject
  		public F_Gen151(F_Gen152 f_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  