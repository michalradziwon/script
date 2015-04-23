
  package gen;
  public class M_Gen48 {
  		@com.google.inject.Inject
  		public M_Gen48(M_Gen49 m_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  