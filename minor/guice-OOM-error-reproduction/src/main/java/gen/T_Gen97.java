
  package gen;
  public class T_Gen97 {
  		@com.google.inject.Inject
  		public T_Gen97(T_Gen98 t_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  