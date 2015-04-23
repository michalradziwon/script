
  package gen;
  public class T_Gen178 {
  		@com.google.inject.Inject
  		public T_Gen178(T_Gen179 t_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  