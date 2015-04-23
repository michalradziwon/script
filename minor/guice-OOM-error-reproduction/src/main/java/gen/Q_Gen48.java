
  package gen;
  public class Q_Gen48 {
  		@com.google.inject.Inject
  		public Q_Gen48(Q_Gen49 q_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  