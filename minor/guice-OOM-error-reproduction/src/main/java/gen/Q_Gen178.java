
  package gen;
  public class Q_Gen178 {
  		@com.google.inject.Inject
  		public Q_Gen178(Q_Gen179 q_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  