
  package gen;
  public class Q_Gen179 {
  		@com.google.inject.Inject
  		public Q_Gen179(Q_Gen180 q_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  