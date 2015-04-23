
  package gen;
  public class T_Gen179 {
  		@com.google.inject.Inject
  		public T_Gen179(T_Gen180 t_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  