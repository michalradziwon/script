
  package gen;
  public class T_Gen98 {
  		@com.google.inject.Inject
  		public T_Gen98(T_Gen99 t_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  